<%--
  Created by IntelliJ IDEA.
  User: daihui
  Date: 2016-09-07
  Time: 2:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Large File Uploader Demo</title>
    <link href="css/jquery-ui.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/javalargefileuploader.js"></script>

<%--    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
    <script src="js/javalargefileuploader.js"></script>--%>

    <script type="text/javascript">
        $(document).ready(function () {

            //construct object
            jlfu = new JavaLargeFileUploader();

            //call the initializing function
            jlfu.initialize(function (pendingFiles) {

                //iterate over all the pending files
                for (key in pendingFiles) {
                    var pendingFile = pendingFiles[key];

                    //create a control element for each of them
                    appendUploadControls(pendingFile.id);

                    //if the file is complete
                    if (pendingFile.fileComplete) {
                        //specify it in the em element
                        document.getElementById(pendingFile.id).children[0].textContent = "The file '" + pendingFile.originalFileName + "' has been fully uploaded (" + pendingFile.fileCompletion + "/" + pendingFile.originalFileSize + ").";
                        deleteElementsButEmAndCancel(pendingFile.id);
                    }
                    //else if incomplete and pending
                    else if (pendingFile.fileCompletion) {

                        //describe the file so that the user can select it again
                        document.getElementById(pendingFile.id).children[0].textContent = "The file '" + pendingFile.originalFileName + "' has been partially uploaded (" + pendingFile.fileCompletion + "/" + pendingFile.originalFileSize + "). Reselect it to continue uploading it or cancel it.";

                        //set progress in progress bar
                        $("#" + pendingFile.id).children(".progressbar").progressbar({
                            value: Math.floor(pendingFile.percentageCompleted)
                        });

                        //set if there is a rate configured
                        if (pendingFile.rateInKiloBytes) {
                            document.getElementById(pendingFile.id).children[2].value = pendingFile.rateInKiloBytes;
                        }

                    }

                }

            }, function (message) {
                alert(message);
            });

            //specify some configuration
            jlfu.setMaxNumberOfConcurrentUploads(3);
            jlfu.getErrorMessages()[9] = "More than 3 pending upload, file is queued.";

            //add a file upload element
            appendFileInputElement();

        });

        function getFileId(element) {
            return element.parentElement.id;
        }

        function appendFileInputElement() {

            //get handle to main container
            var mainContainer = document.getElementById('fileContainer');

            //hide the last children
            if (mainContainer.children.length > 0) {
                mainContainer.children[mainContainer.children.length - 1].hidden = true;
            }

            //generate a new file input control
            var fileInput = document.createElement("input");
            fileInput.type = "file";
            fileInput.setAttribute('multiple', 'multiple');
            mainContainer.appendChild(fileInput);

            //add a listener
            fileInput.addEventListener("change", function (e) {

                //hide the fileupload and append a new one
                appendFileInputElement();

                //process the file upload
                jlfu.fileUploadProcess(e.target,

                        //define a start callback to create the UI that will interact with the file upload
                        function (pendingFile, origin) {
                            appendUploadControls(pendingFile.id);
                        },

                        //define a progressCallback to show the progress in the em elements
                        function (pendingFile, percentageCompleted, uploadRate, estimatedRemainingTime, origin) {
                            document.getElementById(pendingFile.id).children[0].textContent = "Uploading " + pendingFile.originalFileName + " ... (" + percentageCompleted + "% complete) at " + uploadRate + " per second. " + estimatedRemainingTime + " remaining.";
                            $("#" + pendingFile.id).children(".progressbar").progressbar({
                                value: Math.floor(percentageCompleted)
                            });
                        },

                        //define a finishCallback showing the completion in the em element
                        function (pendingFile, origin) {
                            document.getElementById(pendingFile.id).children[0].textContent = "Upload of " + pendingFile.originalFileName + " (" + pendingFile.originalFileSize + ") completed.";
                            deleteElementsButEmAndCancel(pendingFile.id);
                        },

                        //define an exception callback
                        function (message, origin, pendingFile /* pending file object that can be null! if null, it is a general error */ ) {
                            if (pendingFile) {
                                document.getElementById(pendingFile.id).children[0].textContent = message;
                            } else {
                                document.getElementById("error").textContent = message;
                            }
                        });

            }, false);

        }

        function deleteElementsButEmAndCancel(fileId) {
            var div = $('#' + fileId);
            var em = div.children(":first").detach();
            var cancel = div.children(".cancel").detach();
            div.empty();
            div.append(em);
            div.append(cancel);
            div.append(document.createElement('hr'));
        }

        function appendUploadControls(fileId) {

            //get the ui container
            var uiContainer = document.getElementById('uiContainer');

            //append a div
            var div = document.createElement("div");
            div.setAttribute('id', fileId);
            uiContainer.appendChild(div);

            ////
            //create the controls

            //progress bar
            var progressBar = document.createElement("div");
            progressBar.setAttribute("class", "progressbar");
            progressBar.setAttribute("style", "height:20px;");

            // rate input
            var rateInput = document.createElement("input");
            rateInput.type = "text";

            // rate button
            var rateButton = document.createElement("button");
            rateButton.addEventListener("click", function (e) {
                jlfu.setRateInKiloBytes(getFileId(this), this.parentElement.children[2].value);
            });
            rateButton.appendChild(document.createTextNode('Apply'));

            // cancel link
            var cancel = document.createElement("A");
            cancel.setAttribute("href", "javascript:void(0);");
            cancel.setAttribute("class", "cancel");
            cancel.addEventListener("click", function (e) {
                div.children[0].textContent = "Cancelling...";
                jlfu.cancelFileUpload(getFileId(this), function (pendingFileId) {
                    var div = document.getElementById(pendingFileId);
                    div.parentElement.removeChild(div);
                });
            });
            cancel.appendChild(document.createTextNode('Cancel'));

            // pause link
            var pause = document.createElement("A");
            pause.setAttribute("href", "javascript:void(0);");
            pause.addEventListener("click", function (e) {
                div.children[0].textContent = "Pausing...";
                jlfu.pauseFileUpload(getFileId(this), function (pendingFile) {
                    div.children[0].textContent = pendingFile.originalFileName + " is paused.";
                });
            });
            pause.appendChild(document.createTextNode('Pause'));

            // resume link
            var resume = document.createElement("A");
            resume.setAttribute("href", "javascript:void(0);");
            resume.addEventListener("click", function (e) {
                div.children[0].textContent = "Asking for resume...";
                jlfu.resumeFileUpload(getFileId(this), function (pendingFile) {
                    div.children[0].textContent = "Resuming " + pendingFile.originalFileName + " ...";
                });
            });
            resume.appendChild(document.createTextNode('Resume'));


            ////
            //append the controls to the div
            div.appendChild(document.createElement("em"));
            div.appendChild(progressBar);
            div.appendChild(document.createTextNode('Limit the upload rate to '));
            div.appendChild(rateInput);
            div.appendChild(document.createTextNode(' KB '));
            div.appendChild(rateButton);
            div.appendChild(document.createTextNode(' | '));
            div.appendChild(pause);
            div.appendChild(document.createTextNode(' | '));
            div.appendChild(resume);
            div.appendChild(document.createTextNode(' | '));
            div.appendChild(cancel);
            div.appendChild(document.createElement('hr'));


        }
    </script>
</head>

<body>
<div id="fileContainer"></div>
<hr>
<div id="uiContainer"></div>
<div>
    <a href='javascript:void(0)' onclick='jlfu.pauseAllFileUploads();'>Pause all</a>
    <a href='javascript:void(0)' onclick='jlfu.resumeAllFileUploads();'>Resume all</a>
    <a href='javascript:void(0)' onclick='jlfu.clearFileUpload(function(e) {window.location.reload();});'>Clear all</a>
</div>
<em id="error"></em>
</body>

</html>
