package homework.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;
    private int index;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false
    //Գրել մեթոդ getStudentByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը
    //Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).
    //Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի
    //Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean isEmpty(int[] array) {
        return (size == 0);
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("This index does not exist!");
        }
        if (size != 0) {
            return array[index];
        } else return 0;
    }

    public int getFirstIndexByValue(int value) {

        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                index = i;
                break;
            }
        }
        return (index);

    }

    public void set(int index, int value) {
        if (index < 0 || index > size) System.out.println("This index does not exist!");
        array[index] = value;
    }

    public void delete(int index) {
        if (index < 0 || index > size) System.out.println("This index does not exist!");
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) System.out.println("This index does not exist!");
        for (int i = index; i < size - 1; i++) {
            array[i + 1] = array[i];
            array[index] = value;
        }


    }
}


