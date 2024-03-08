package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

public class FileTest {

    public static void main(String[] args) {

        WatchService watchService = new WatchService() {
            @Override
            public void close() throws IOException {

            }

            @Override
            public WatchKey poll() {
                return null;
            }

            @Override
            public WatchKey poll(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public WatchKey take() throws InterruptedException {
                return null;
            }
        };

        Paths.get("D://document.txt");
    }
}
