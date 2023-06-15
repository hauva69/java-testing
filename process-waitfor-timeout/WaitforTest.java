import java.io.IOException;
import java.lang.Process;
import java.lang.ProcessBuilder;
import java.util.concurrent.TimeUnit;

class WaitforTest {
    public static void main(String[] args) {
        final ProcessBuilder processBuilder = new ProcessBuilder("./sleep-5.sh");

        try {
            final Process process = processBuilder.start();
            boolean exitCode = process.waitFor(2, TimeUnit.SECONDS);
            process.destroyForcibly();
            System.out.println("exitCode=" + exitCode);
        } catch(IOException ex) {
            System.out.println(ex);
        } catch(InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
