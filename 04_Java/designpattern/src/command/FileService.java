package command;

public class FileService {
    String filename;

    void open() {
        filename = "test.txt";
        System.out.println(filename + "열였습니다.");
    }

    void print() {
        System.out.println(filename + "프린트합니다.");
    }
}
