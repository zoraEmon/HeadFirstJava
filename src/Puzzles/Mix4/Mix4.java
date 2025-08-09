package Puzzles.Mix4;

public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;

        Mix4[] mix4s = new Mix4[20];

        int x = 0;

        while(x < 19) {
            mix4s[x] = new Mix4();
            mix4s[x].counter = mix4s[x].counter + 1;
            count = count + 1;
            count = count + mix4s[x].maybeNew(x);

            x = x + 1;
        }

        System.out.println(count + " " + mix4s[18].counter);
    }

    public int maybeNew(int index) {
        if(index < 7) {
            return 1;
        }

        return 0;
    }
}
