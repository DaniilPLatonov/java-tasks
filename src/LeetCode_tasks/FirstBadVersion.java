package LeetCode_tasks;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int good = 1;
        int bad = n;

        while (good <= bad) {
            int mid = (good + (bad - good) / 2);
             if (isBadVersion(mid) == false) {
                good = mid + 1;
            } else {
                bad = mid - 1;
            }
        }
        return good;
    }
}*/
