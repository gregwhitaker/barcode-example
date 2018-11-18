package barcode.example.reader;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ReadQRCode {

    public static String read(String imagePath) throws Exception {
        BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        try {
            Result data = new MultiFormatReader().decode(bitmap);
            return data.getText();
        } catch (NotFoundException e) {
            System.out.println("No QR code found");
            return null;
        }
    }
}
