public class ReversibleArray<T> {
   private T[] array;
   private int count;

   public ReversibleArray(T[] array) {
      this.array = array;
      this.count = array.length;
   }

   public void reverse() {
      T temp;
      for (int i = 0; i < count / 2; i++) {
         temp = array[i];
         array[i] = array[count - 1 - i];
         array[count - 1 - i] = temp;
      }
   }

   public String toString() {
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < count; i++) {
         result.append(array[i]);
         if (i < count - 1) {
            result.append(", ");
         }
      }
      return result.toString();
   }
}
