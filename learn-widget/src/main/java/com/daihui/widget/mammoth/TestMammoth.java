package com.daihui.widget.mammoth;

import org.zwobble.mammoth.DocumentConverter;
import org.zwobble.mammoth.Result;

import java.io.File;
import java.io.IOException;
import java.util.Set;

/**
 * Mammoth旨在转换.docx文档（例如由Microsoft Word创建的文档），并将其转换为HTML。
 * Mammoth的目标是通过使用文档中的语义信息并忽略其他细节来生成简单干净的HTML。
 * 例如，猛mm象将具有样式的任何段落转换Heading 1为h1元素，而不是尝试准确复制标题的样式（字体，文本大小，颜色等）。
 *
 * .docx使用的结构与HTML的结构之间存在很大的不匹配，这意味着对于较复杂的文档而言，这种转换不太可能是完美的。
 * 如果仅使用样式在语义上标记文档，则猛mm象效果最好。
 * @Date: Created in 11:32 上午 2019/12/20
 * @Author: daihui
 * @Modified By:
 */
public class TestMammoth {

    public static void main(String[] args) {

        String str1 = "ABC";
        String str2 = new String("ABC");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

//        con();
//        con1();
    }

    /**
     * 要将现有的.docx文件转换为HTML，请创建的实​​例DocumentConverter并将的实例传递File给convertToHtml。例如：
     */

    public static void con(){
        DocumentConverter converter = new DocumentConverter();
        Result<String> result = null;
        try {
            result = converter.convertToHtml(new File("/Users/daihui/Documents/个人/word/JAVA/已看/GC简介.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // The generated HTML
        String html = result.getValue();
        System.out.println(html);
        // Any warnings during conversion
        Set<String> warnings = result.getWarnings();

    }

    /**
     * 提取文档的原始文本extractRawText。这将忽略文档中的所有格式。每个段落后跟两个换行符
     */
    public static void con1(){
        DocumentConverter converter = new DocumentConverter();
        Result<String> result = null;
        try {
            result = converter.extractRawText(new File("/Users/daihui/Documents/个人/word/JAVA/已看/GC简介.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // The raw text
        String html = result.getValue();
        System.out.println(html);
        // Any warnings during conversion
        Set<String> warnings = result.getWarnings();
    }


    /**
     * DocumentConverter API
     *
     * 方法：
     *
     * Result<String> convertToHtml(File file)：转换file为HTML字符串。
     *
     * Result<String> convertToHtml(InputStream stream)：转换stream为HTML字符串。请注意，使用此方法代替convertToHtml(File file)意味着无法解析到其他文件的相对路径，例如图像。
     *
     * Result<String> extractRawText(File file)：提取文档的原始文本。这将忽略文档中的所有格式。每个段落后跟两个换行符。
     *
     * Result<String> extractRawText(InputStream stream)：提取文档的原始文本。这将忽略文档中的所有格式。每个段落后跟两个换行符。
     *
     * DocumentConverter addStyleMap(String styleMap)：添加样式图以指定Word样式到HTML的映射。最近添加的样式图具有最高的优先级。有关语法的说明，请参见“书写样式图”一节。
     *
     * DocumentConverter disableDefaultStyleMap()：默认情况下，所有添加的样式图都会与默认样式图组合。调用此选项可完全停止使用默认样式图。
     *
     * DocumentConverter disableEmbeddedStyleMap()：默认情况下，如果文档包含嵌入式样式图，则它将与默认样式图结合在一起。调用此选项可忽略任何嵌入式样式图。
     *
     * DocumentConverter preserveEmptyParagraphs()：默认情况下，空的段落将被忽略。调用此命令可在输出中保留空的段落。
     *
     * DocumentConverter idPrefix(String idPrefix)：一个字符串，可附加在任何生成的ID之前，例如书签，脚注和尾注所使用的ID。默认为空字符串。
     *
     * DocumentConverter imageConverter(ImageConverter.ImgElement imageConverter)：默认情况下，图像会转换为<img>元素，且其源包含在src属性中。调用此按钮可以更改图像的转换方式。
     *
     * Result<T>
     * 表示转换结果。方法：
     *
     * T getValue()：生成的文本。
     *
     * Set<String> getWarnings()：转换期间产生的所有警告。
     *
     * 图像转换器
     * 可以通过实现创建图像转换器ImageConverter.ImgElement。这<img>将为原始docx中的每个图像创建一个元素。该接口只有一个方法Map<String, String> convert(Image image)。所述image参数是正在转换的图像元素，并具有以下的方法：
     *
     * InputStream getInputStream()：打开图像文件。
     *
     * String getContentType()：图片的内容类型，例如image/png。
     *
     * Optional<String> getAltText()：图片的替代文字（如果有）。
     *
     * convert()应该返回元素Map的属性<img>。至少应包括该src属性。如果找到图像的替代文本，它将自动添加到元素的属性中。
     * 例如，以下复制默认的图像转换：
     *      DocumentConverter converter = new DocumentConverter()
     *     .imageConverter(image -> {
     *         String base64 = streamToBase64(image::getInputStream);
     *         String src = "data:" + image.getContentType() + ";base64," + base64;
     *         Map<String, String> attributes = new HashMap<>();
     *         attributes.put("src", src);
     *         return attributes;
     *     });
     * 其中streamToBase64的功能是读取输入流并将其编码为Base64字符串。
     *
     */
}
