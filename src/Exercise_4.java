public class Exercise_4 {
    public static void main(String[] args) {

        String fullName= "������ ���� ��������";

        if (fullName.contains("�")){
            String f = fullName.replace("�", "�");
            System.out.println("������ ��� ���������� � " + f);
        } else {
            System.out.println("������ ��� ���������� � " + fullName);
        }

    }
}
