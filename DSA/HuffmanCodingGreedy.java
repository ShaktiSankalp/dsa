import java.util.PriorityQueue;

// Node class for Huffman tree
class HuffmanNode {
    char ch;
    int freq;
    HuffmanNode left, right;

    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    // For internal nodes (no character)
    HuffmanNode(int freq, HuffmanNode left, HuffmanNode right) {
        this.ch = '-';
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}

public class HuffmanCodingGreedy {

    // Comparator for PriorityQueue (min-heap based on freq)
    static PriorityQueue<HuffmanNode> createMinHeap(char[] chars, int[] freqs) {
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>((a, b) -> a.freq - b.freq);
        for (int i = 0; i < chars.length; i++) {
            pq.add(new HuffmanNode(chars[i], freqs[i]));
        }
        return pq;
    }

    // Recursive function to print Huffman codes
    static void printCodes(HuffmanNode root, String code) {
        if (root == null) return;

        if (root.left == null && root.right == null && root.ch != '-') {
            System.out.println(root.ch + ": " + code);
        }

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void huffmanCode(char[] chars, int[] freqs) {
        PriorityQueue<HuffmanNode> pq = createMinHeap(chars, freqs);

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode merged = new HuffmanNode(left.freq + right.freq, left, right);
            pq.add(merged);
        }

        HuffmanNode root = pq.poll();  // Root of the tree
        System.out.println("Huffman Codes:");
        printCodes(root, "");
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] freqs = { 5, 9, 12, 13, 16, 45 };

        huffmanCode(chars, freqs);
    }
}
