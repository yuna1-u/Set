import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2));

        System.out.println(symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> set = new HashSet<>(set1);
        set.removeAll(set2);

        for (Integer i : set2) {
            if (!set1.contains(i)) {
                set.add(i);

            }

        }
        return set;

    }
}