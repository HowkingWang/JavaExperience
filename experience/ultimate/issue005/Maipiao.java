public class Maipiao {
    public static void main(String args[]) {
        Thread zhangsan, lisi, wangwu;
        Sale sale = new Sale();
        zhangsan = new Thread(sale);
        zhangsan.setName("z");
        lisi = new Thread(sale);
        lisi.setName("l");
        wangwu = new Thread(sale);
        wangwu.setName("w");
        zhangsan.start();
        lisi.start();
        wangwu.start();
    }
}

class Sale implements Runnable {

    int number10 = 3, number20 = 0;
    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("l")) { 
            number10++;
            System.out.println("������10Ԫ���պ�һ��Ʊ");
        } else if (name.equals("w")) {
            number20++;
            number10--;
            System.out.println("������20Ԫ������10Ԫ��");
        } else if (name.equals("z")) {
            while (number10 < 4 && number20 == 0) {
                Thread.yield();//��ͣ��ǰ�̲߳�ִ�������̣߳����п���ûЧ����
            }
            number10 = number10 - 2;
            number20--;
            System.out.println("������50Ԫ������40Ԫ������10Ԫ��һ��20Ԫ��");

        }
      
    }
}

