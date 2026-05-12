import java.io.*;
import java.net.*;
import java.util.*;

public class DecodeMessage {

    public static void decodeSecretMessage(String urlString) throws Exception {
        URL url = new URI(urlString).toURL();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(url.openStream())
        );

        String line;
        List<int[]> coords = new ArrayList<>();
        List<Character> chars = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            line = line.trim();

            // Skip header or empty lines
            if (line.isEmpty() || line.contains("x-coordinate")) continue;

            String[] parts = line.split("\\s+");
            if (parts.length < 3) continue;

            int x = Integer.parseInt(parts[0]);
            char ch = parts[1].charAt(0);
            int y = Integer.parseInt(parts[2]);

            coords.add(new int[]{x, y});
            chars.add(ch);
        }

        reader.close();

        // Find grid size
        int maxX = 0, maxY = 0;
        for (int[] coord : coords) {
            maxX = Math.max(maxX, coord[0]);
            maxY = Math.max(maxY, coord[1]);
        }

        // Create grid
        char[][] grid = new char[maxY + 1][maxX + 1];

        // Fill with spaces
        for (int i = 0; i <= maxY; i++) {
            Arrays.fill(grid[i], ' ');
        }

        // Place characters
        for (int i = 0; i < coords.size(); i++) {
            int x = coords.get(i)[0];
            int y = coords.get(i)[1];
            grid[y][x] = chars.get(i);
        }

        // Print result
        for (int i = 0; i <= maxY; i++) {
            System.out.println(new String(grid[i]));
        }
    }

    public static void main(String[] args) throws Exception {
        String url = "https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub";
        decodeSecretMessage(url);
    }
}