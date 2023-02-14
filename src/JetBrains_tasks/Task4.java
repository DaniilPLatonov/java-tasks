package JetBrains_tasks;

import java.util.*;

public class Task4 {

    static class Tree {
        private final Node root;

        public static class Node {
            private final Integer a;
            private final Integer len;
            private final Integer num;
            private Node parent;

            public Integer getNum() {
                return num;
            }

            private Set<Node> children = new TreeSet<>(Comparator.comparing(Node::getNum));

            public Node(Integer a, Integer len, Integer characteristics) {
                this.a = a;
                this.len = len;
                this.num = characteristics;
            }
        }
        public Tree(Integer filters, Integer len, Integer num) {
            root = new Node(filters, len, num);
        }
        void add(Integer filters, Integer len, Integer characteristics, Integer newNum) {
            Node node = new Node(filters, len, newNum);
            Queue<Set<Node>> q = new LinkedList<>();
            Set<Node> current = new TreeSet<>(Comparator.comparing(Node::getNum));
            current.add(root);
            boolean isAdd = false;
            while (current != null || !q.isEmpty()) {
                assert current != null;
                for (Node n : current) {
                    if (Objects.equals(n.num, characteristics)) {
                        node.parent = n;
                        n.children.add(node);
                        isAdd = true;
                        break;
                    }
                    if (isAdd) break;
                    q.add(n.children);
                }
                current = q.poll();
            }
        }
        public List<Integer> calc(Integer size) {
            List<Integer> r = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                r.add(0);
            }
            Queue<Set<Node>> queue = new LinkedList<>();
            Set<Node> current = new TreeSet<>(Comparator.comparing(Node::getNum));
            current.add(root);
            r.set(root.num - 1, accept(root));
            while (current != null || !queue.isEmpty()) {
                for (Node n : current) {
                    queue.add(n.children);
                    r.set(n.num - 1, accept(n));
                }
                current = queue.poll();

            }
            return r;
        }

        public static Integer accept(Node node) {
            int count = 0;
            if (node.children.isEmpty()) return count;
            Stack<Pair<LinkedList<Node>, Integer>> stack = new Stack<>();
            stack.push(new Pair<>(new LinkedList<>(node.children), 0));
            while (!stack.isEmpty()) {
                Node c = stack.peek().left.pop();
                int len = stack.peek().right;
                if (len + c.len <= c.a) count++;
                if (!c.children.isEmpty())
                    stack.push(new Pair<>(new LinkedList<>(c.children), len + c.len));
                else {
                    if (stack.peek().left.isEmpty())
                        stack.pop();
                }
            }
            return count;
        }

        public static class Pair<T, V> {
            T left;
            V right;

            Pair(T l, V r) {
                left = l;
                right = r;
            }
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> filters = new LinkedList<>();
        LinkedList<Integer> characteristics = new LinkedList<>();
        LinkedList<Integer> length = new LinkedList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            filters.add(scanner.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            characteristics.add(scanner.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            length.add(scanner.nextInt());
        }
        Tree tree = new Tree(filters.getFirst(), 0, 1);
        for (int i = 0; i < n - 1; i++) {
            tree.add(filters.get(i + 1), length.get(i), characteristics.get(i), i + 2);
        }
        tree.calc(n).forEach(System.out::println);

    }

}

