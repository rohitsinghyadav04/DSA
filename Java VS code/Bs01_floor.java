class Bs01_floor{
    public static void main(String[] var0) {
        int[] var1 = new int[]{2, 3, 5, 9, 14, 16, 18};
        byte var2 = 15;
        int var3 = floor(var1, var2);
        System.out.println(var3);
    }

    static int floor(int[] var0, int var1) {
        int var2 = 0;
        int var3 = var0.length - 1;

        while(var2 <= var3) {
            int var4 = var2 + (var3 - var2) / 2;
            if (var1 < var0[var4]) {
                var3 = var4 - 1;
            } else {
                if (var1 <= var0[var4]) {
                    return var4;
                }

                var2 = var4 + 1;
            }
        }

        return var3;
    }
}