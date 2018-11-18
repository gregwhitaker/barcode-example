package barcode.example.generator;

import barcode.example.model.Address;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.ByteArrayOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class GenerateQRCode {

    public static void generate(String imagePath) throws Exception {
        // Dummy data to encode to qr code
        Address address = new Address();
        address.setRecipientFirstName("John");
        address.setRecipientLastName("Smith");
        address.setStreet1("201 South Main St.");
        address.setUnitNumber(3);
        address.setCity("Hoboken");
        address.setState("NJ");
        address.setZipcode("07030");
        address.setPlus4code("0009");

        // Convert the address to json
        ObjectMapper mapper = new ObjectMapper();
        String data = mapper.writeValueAsString(address);

        GenerateQRCode.generateAsImage(data, 350, 350, imagePath);
    }

    private static void generateAsImage(String data, int width, int height, String filename) throws Exception {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filename);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }

    private byte[] generateAsBytes(String data, int width, int height) throws Exception {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, width, height);

        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);
        return pngOutputStream.toByteArray();
    }
}
