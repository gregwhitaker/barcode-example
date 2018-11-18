package barcode.example;

import barcode.example.generator.GenerateQRCode;

/**
 * Starts the barcode-example application.
 */
public class Main {

    public static void main(String... args) throws Exception {
        String command = args[0];

        if (command.equalsIgnoreCase("generate")) {
            GenerateQRCode.generate();
        } else {

        }
    }
}
