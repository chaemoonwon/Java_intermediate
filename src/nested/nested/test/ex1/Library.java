package nested.nested.test.ex1;

public class Library {

    private int count;
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(String bookName, String author) {

        //검증 로직을 처리
        if (count >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        //정상 로직을 처리
        books[count++] = new Book(bookName, author);

//
//        if (count < books.length) {
//            books[count++] = new Book(bookName, author);
//        } else {
//            System.out.println("도서관 저장 공간이 부족합니다.");
//        }

    }

    //도서관의 모든 도서 정보 출력
    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + books[i].bookName + ", 저자: " + books[i].author);
        }
    }

    private static class Book {

        String bookName;
        String author;

        public Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }
    }

}
