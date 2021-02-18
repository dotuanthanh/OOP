import java.util.Scanner;
import java.util.Set;

public class ptBacHai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a b c");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        hamSo ptbac2 = new hamSo(a, b, c);
        double dt = ptbac2.delta();
        System.out.println("delta la " + dt);
        ptbac2.nghiem();

    }

    public static class hamSo {
        int a;
        int b;
        int c;
        int dt;
        double x1;
        double x2;

        public hamSo() {
        }

        public hamSo(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double delta() {
            return this.dt = this.b * this.b - 4 * this.a * this.c;
        }

        public void nghiem() {
            if (this.dt < 0) {
                System.out.println("Vo nghiem");
            } else if (this.dt == 0) {
                this.x1 = -this.b / (2 * this.a);
                this.x2 = -this.b / (2 * this.a);
                System.out.println("ngiem kep  la "+this.x1);
            } else {
                this.x1 = (-b - Math.sqrt(this.dt)) / (2 * this.a);
                this.x2 = (-b + Math.sqrt(this.dt)) / (2 * this.a);
                System.out.println(this.x1);
                System.out.println(this.x2);
            }
        }

        public void hienThi() {
            System.out.println("nghiem cua  ptrinh la  " + this.x1 + " " + this.x2);
        }
    }
}
