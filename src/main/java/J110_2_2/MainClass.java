package J110_2_2;

public class MainClass {

       public static void main(String[] args) {

            // Массив с информацией о файлах

            Files[] files = {

                    new Images ("spb-map.png", 1703527, "image", 1024, 3072),
                    new Documents ("j110-lab2-hiers.docx", 23212, "docx", 2),
                    new VideoFiles ("BackToTheFuture1.avi", 1470984192, "video",
                            "Back to the Future I", 1, 48, 8, 640, 352),
                    new MultiMediaFiles ("06-PrettyGirl.mp3", 7893454, "audio",
                            "Eric Clapton - Pretty Girl", 5, 28)
            };

            // Вывод информации о всех файлах в консоль

            Files.printAll(files);
        }
}