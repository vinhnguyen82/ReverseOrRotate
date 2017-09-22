public class RevRot {

    public static String revRot(String strng, int sz) {
        if (sz <= 0 || strng.length() == 0 || sz > strng.length()) {
            return "";
        }
        return revRotHelper(strng, sz);
    }

    public static String revRotHelper(String st, int size) {
        String result = "";

        for (int i = 0; i < (st.length() / size); i++) {
            String chunk = st.substring(i * size, i * size + size);

            String newChunk = chunkTesting(chunk);

            result += newChunk;
        }
        return result;
    }

    private static String chunkTesting(String chunk) {

        int len = chunk.length();
        int sumCubes = 0;

        for (int i = 0; i < len; i++) {
            sumCubes += (Integer.parseInt(chunk.substring(i, i + 1)) * Integer.parseInt(chunk.substring(i, i + 1)));
        }

        if (sumCubes % 2 == 0) {
            return reverse(chunk);
        }
        return chunk.substring(1, len) + chunk.substring(0, 1);
    }

    private static String reverse(String chunk) {
        StringBuilder sb = new StringBuilder();

        for (int i = chunk.length() - 1; i >= 0; i--) {
            sb.append(chunk.charAt(i));
        }
        return sb.toString();
    }
}
