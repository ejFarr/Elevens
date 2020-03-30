1. public static String flip() {
    Random rand = new Random();
    int r = rand.nexInt(3);
    if (r % 2 == 0) {
        return "heads"
    }
    return "tails"
}
2. public static boolean arePermutations(int[] array1, int[] array2) {
    boolean foundMatch;
    for (int i = 0; i < array1.length; i++) {
        foundMathc = false
        for (int j = 0; j < array1.length; j++) {
            if (array1[i] == array2[j]) {
                foundMatch = true;
            }
        }
        if (!foundMatch) {
            return false;
        }
    }
}
3. 0, 1;