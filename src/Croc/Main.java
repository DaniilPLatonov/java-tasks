package Croc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int logEntries = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> resourcePathCount = new HashMap<>();
        Map<String, Set<String>> resourcePathIPs = new HashMap<>();
        Map<String, Integer> statusCodeCount = new HashMap<>();

        for (int i = 0; i < logEntries; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            String ip = parts[0];
            String resourcePath = parts[2];
            int statusCode = Integer.parseInt(parts[3]);

            resourcePathCount.put(resourcePath, resourcePathCount.getOrDefault(resourcePath, 0) + 1);

            Set<String> ips = resourcePathIPs.getOrDefault(resourcePath, new HashSet<>());
            ips.add(ip);
            resourcePathIPs.put(resourcePath, ips);

            if (statusCode >= 200 && statusCode <= 299) {
                statusCodeCount.put(resourcePath, statusCodeCount.getOrDefault(resourcePath, 0) + 1);
            }
        }

        int queries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < queries; i++) {
            String query = scanner.nextLine();
            int count = 0;
            int uniqueIPs = 0;
            int successCount = 0;

            if (query.endsWith("*")) {
                String prefix = query.substring(0, query.length() - 1);
                for (String resourcePath : resourcePathCount.keySet()) {
                    if (resourcePath.startsWith(prefix)) {
                        count += resourcePathCount.get(resourcePath);
                        uniqueIPs += resourcePathIPs.get(resourcePath).size();
                        successCount += statusCodeCount.getOrDefault(resourcePath, 0);
                    }
                }
            } else {
                count = resourcePathCount.getOrDefault(query, 0);
                uniqueIPs = resourcePathIPs.getOrDefault(query, new HashSet<>()).size();
                successCount = statusCodeCount.getOrDefault(query, 0);
            }

            System.out.println(count + " " + uniqueIPs + " " + successCount);
        }
    }
}
