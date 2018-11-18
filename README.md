# barcode-example
[![Build Status](https://travis-ci.org/gregwhitaker/barcode-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/barcode-example)

An example of using [ZXing](https://github.com/zxing/zxing) to generate barcodes.

## Running the Example
Follow the steps below to run the example:

1. Run the following command to generate a QR code named `myqrcode.png` in the root directory:

        ./gradlew generateBarcode
        
    If successful, you will see the generated QR barcode `myqrcode.png` in the root project directory.
    
2. Run the following command to read the data from the generated barcode:

        ./gradlew readBarcode
        
    If successful, you will see the decoded data in the terminal:
    
        > Task :readBarcode
        {"recipientFirstName":"John","recipientLastName":"Smith","street1":"201 South Main St.","unitNumber":3,"city":"Hoboken","state":"NJ","zipcode":"07030","plus4code":"0009"}

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/barcode-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.