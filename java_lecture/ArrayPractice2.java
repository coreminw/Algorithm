package java_lecture;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };

        Integer count = 0;

        for (Integer i = 0; i < dataset.length ; i++) {//배열.length: 배열에 들어 있는 아이템 갯수
            if (dataset[i].indexOf("M")>=0){//문자열.indexof(String key): 문자 key 가 해당 문자열에 있으면 해당 문자의 위치(index값)를 리턴하고 없으면 -1 리턴
                count++;
            }

        }
        System.out.println(count);

    }
}
