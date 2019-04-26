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
            System.out.println("您给我10元。刚好一张票");
        } else if (name.equals("w")) {
            number20++;
            number10--;
            System.out.println("您给我20元。找您10元。");
        } else if (name.equals("z")) {
            while (number10 < 4 && number20 == 0) {
                Thread.yield();//暂停当前线程并执行其它线程（但有可能没效果）
            }
            number10 = number10 - 2;
            number20--;
            System.out.println("您给我50元，找您40元。两张10元。一张20元。");

        }
      
    }
}

