// work with all paths in a cross-platform manner
const path = require('path');
module.exports = {
  entry:'./main.js',
  output:{
    filename:'./bundle.js'
  },
  module:{
    loaders:[
      {
        test:/\.css$/,
        loader:'style-loader!css-loader'
      }
    ]
  }
};
