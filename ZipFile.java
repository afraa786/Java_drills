import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipFile {
    public static void main(String[] args) {
        String sourceFile = "website.txt";
        String zipFileName = "fareed.zip";
        //exceptions 
        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(zipFileName);
                ZipOutputStream zipOut = new ZipOutputStream(fos)
        ) {
            File fileToZip = new File(sourceFile);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024]; //defining bytes
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            zipOut.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
