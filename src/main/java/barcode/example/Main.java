package barcode.example;

import barcode.example.generator.GenerateQRCode;
import barcode.example.reader.ReadQRCode;

/**
 * Starts the barcode-example application.
 */
public class Main {

    public static void main(String... args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("Invalid number of arguments");
        }

        String command = args[0];
        String imagePath = args[1];

        if (command.equalsIgnoreCase("generate")) {
            GenerateQRCode.generate(imagePath);
        } else {
            String data = ReadQRCode.read(imagePath);
            System.out.println(data);
        }
    }
}
