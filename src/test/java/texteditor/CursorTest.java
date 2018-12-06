package texteditor;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public class CursorTest {
    private static final Logger log = getLogger(CursorTest.class);
    Cursor cursor;

    @Before
    public void setUp() throws Exception {
        cursor = new Cursor();
    }

    @Test
    public void 한줄씩_데이터_저장() {
        String data = "Hello World!";
        cursor.create(data);
    }

    @Test
    public void 한줄씩_데이터_읽기() {
        String data = "Hello World!";
        cursor.create(data);

        int lineNum = 0;
        assertThat(cursor.read(lineNum)).isEqualTo("Hello World!");
    }

    @Test
    public void 해당줄_Col_이후_끝까지_읽어오기() {
        String data = "Hello World!";
        cursor.create(data);

        assertThat(cursor.read(0, 3)).isEqualTo("lo World!");
    }

    @Test
    public void 해당줄_Col_이후_해당인덱스까지_읽어오기() {
        String data = "Hello World!";
        cursor.create(data);

        assertThat(cursor.read(0, 3, 8)).isEqualTo("lo Wo");
    }

    @Test
    public void 해당_줄_통째로_업데이트() {
        String data = "Hello World!";
        cursor.create(data);

        cursor.update(0, "안녕하세요");
        assertThat(cursor.read(0)).isEqualTo("안녕하세요");
    }

    @Test
    public void 해당_줄_특정col이후_끝까지_업데이트() {
        String data = "Hello World!";
        cursor.create(data);

        cursor.update(0, 7, "안녕하세요");
        assertThat(cursor.read(0)).isEqualTo("Hello W안녕하세요");
    }

    @Test
    public void 해당_줄_특정col이후_특정col까지_업데이트() {
        String data = "Hello World!";
        cursor.create(data);

        cursor.update(0, 7, 10, "안녕하세요");
        assertThat(cursor.read(0)).isEqualTo("Hello W안녕하세요d!");
    }

    @Test
    public void 해당_줄_통째로_삭제() {
        String data = "Hello World!";
        String data2 = "니하오, 안녕!!";
        cursor.create(data);
        cursor.create(data2);

        cursor.delete(0);
        assertThat(cursor.read(0)).isEqualTo(data2);
    }

    @Test
    public void 해당_줄_특정col이후_끝까지_삭제() {
        String data = "Hello World!";
        cursor.create(data);

        cursor.delete(0, 3);
        assertThat(cursor.read(0)).isEqualTo("Hel");
    }

    @Test
    public void 해당_줄_특정col이후_특정col까지_삭제() {
        String data = "Hello World!";
        cursor.create(data);

        cursor.delete(0, 3, 7);
        assertThat(cursor.read(0)).isEqualTo("Helorld!");
    }
}