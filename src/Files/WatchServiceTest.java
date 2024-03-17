package Files;

import java.nio.file.*;

public class WatchServiceTest
{
    public static void main(String[] args) {

        try {
            // Tạo đối tượng WatchService
            WatchService watchService = FileSystems.getDefault().newWatchService();

            String directoryPath = "D://";

            Path directory = Paths.get(directoryPath);
            directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);

            System.out.println("Watching directory: " + directoryPath);

            // Vòng lặp để xử lý các sự kiện
            while (true) {
                WatchKey key;
                try {
                    key = watchService.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }

                // Lặp qua các sự kiện trong WatchKey
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    // Xử lý các sự kiện tương ứng
                    if (kind == StandardWatchEventKinds.OVERFLOW) {
                        continue;
                    } else if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                        System.out.println("File created: " + event.context());
                    } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                        System.out.println("File modified: " + event.context());
                    } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                        System.out.println("File deleted: " + event.context());
                    }
                }

                // Đặt lại WatchKey để tiếp tục theo dõi sự thay đổi
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }

            // Đóng WatchService khi không cần thiết nữa
            watchService.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
