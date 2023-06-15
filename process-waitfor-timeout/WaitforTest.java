import java.io.IOException;
import java.lang.Process;
import java.lang.ProcessBuilder;

class WaitforTest {
    public static void main(String[] args) {
        final ProcessBuilder processBuilder = new ProcessBuilder("./sleep-5.sh");
        try {
            final Process process = processBuilder.start();
            int exitCode = process.waitFor();
        } catch(IOException ex) {
            System.out.println(ex);
        } catch(InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
