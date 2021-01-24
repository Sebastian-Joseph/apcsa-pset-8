public class ProblemSet8 {

    public boolean common(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        }
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public int[] middleman(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 == 0 || b.length % 2 == 0){
           return null;
}
        int ahalf = a.length / 2;
        int bhalf = b.length / 2;
        int[] middle = {a[ahalf], b[bhalf]};
        return middle;
    }

    public int[] bigger(int[] a, int[] b) {
if (a == null || b == null) {
    return null;
}
int sumofA = 0;
int sumofB = 0;

for (int i = 0; i < a.length; i++){
    sumofA+=a[i];
}
for (int i = 0; i < b.length; i++){
    sumofB+=b[i];
}
if(sumofA > sumofB || sumofA == sumofB){
    return a;
} else {
    return b;
}
    }

    public int[] doubleMiddle(int[] a, int[] b) {
if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 == 0 || b.length % 2 == 0){
    return null;
}
int mida1 = a.length / 2;
int mida2 = a.length / 2 - 1;
int midb1 = b.length / 2;
int midb2 = b.length / 2 - 1;
int[] doublemiddle = {a[mida2], a[mida1], b[midb2], b[midb1]};
return doublemiddle;
    }

    public int[] swapMe(int[] a) {
if (a == null){
    return null;
}
int one = a[0];
a[0] = a[a.length-1];
a[a.length-1] = one;
return a;
    }

    public int[] threePoint(int[] a) {
if (a == null || a.length == 0 || a.length % 2 == 0){
    return null;
}
int mid = a.length / 2;
int end = a.length - 1;
int[] point = {a[0], a[mid], a[end]};
return point;
    }

    public int headHoncho(int[] a) {
if (a == null || a.length == 0 || a.length < 0 ) {
    return -1;
}
int max = a[0];
for(int i = 0; i < a.length; i++) {
    if (max<a[i]) {
        max = a[i];
    }
}
return max;
    }

    public boolean tippingPoint(int[] a, int threshold) {
int sum = 0;
if (a == null){
    return false;
}
for(int i = 0; i < a.length; i++){
    sum += a[i];
}
if (sum > threshold){
    return true;
}else {
    return false;
}
    }

    public String halfway(int[] a) {
if (a == null || a.length == 0 || a.length % 2 == 1){
    return null;
}
int left = 0;
int right = 0;
for(int i = 0; i <= a.length / 2 - 1; i++){
    left += a[i];
}
for(int z = a.length/2; z <= a.length -1; z++){
    right += a[z];
}
if (left > right){
    return "LEFT";
}
else {
    return "RIGHT";
}
    }

    public int[] sequential(int[] a, int[] b) {
        int[] tres = new int[3];
if (a == null || b == null || a.length + b.length > 3 || a.length + b.length < 3) {
    int somethingidkicanthinkofanything = 0;
    for(int i = 0; i < 3; i++){
        if(i < a.length){
            tres[i] = a[i];
        }
        else {
            tres[i] = b[somethingidkicanthinkofanything];
            somethingidkicanthinkofanything++;
        }
    }
    return tres;
}
return null;
    }
}