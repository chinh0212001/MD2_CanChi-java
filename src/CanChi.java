import java.util.Scanner;

public class CanChi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam");
        int can, chi;
        int year = scanner.nextInt();
        can = year % 10;
        chi = year % 12;
        String strCan = "";
        String strChi = "";

        switch (can) {
            case 0:
                strCan = "CANH";
                break;
            case 1:
                strCan = "TÂN";
                break;
            case 2:
                strCan = "NHÂM";
                break;
            case 3:
                strCan = "QUÝ";
                break;
            case 4:
                strCan = "GIÁP";
                break;
            case 5:
                strCan = "ẤT";
                break;
            case 6:
                strCan = "BÍNH";
                break;
            case 7:
                strCan = "ĐINH";
                break;
            case 8:
                strCan = "MẬU";
                break;
            case 9:
                strCan = "KỶ";
                break;
        }
        switch (chi) {
            case 0:
                strChi = "THÂN";
                break;
            case 1:
                strChi = "DẬU";
                break;
            case 2:
                strChi = "TUẤT";
                break;
            case 3:
                strChi = "HỢI";
                break;
            case 4:
                strChi = "TÝ";
                break;
            case 5:
                strChi = "SỬU";
                break;
            case 6:
                strChi = "DẦN";
                break;
            case 7:
                strChi = "MÃO";
                break;
            case 8:
                strChi = "ThÌN";
                break;
            case 9:
                strChi = "TỴ";
                break;
            case 10:
                strChi = "NGỌ";
                break;
            case 11:
                strChi = "MÙI";
                break;

        }
        System.out.println(strCan +" "+ strChi);
    }
}