package texteditor;

import org.junit.Test;
import texteditor.utils.Parser;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTest {

    @Test
    public void parse_메서드_테스트() {
        String answer = "1 2 안녕하세요";
        Object[] data = Parser.parse(answer);
        assertThat(data[0]).isEqualTo(1);
        assertThat(data[1]).isEqualTo(2);
        assertThat(data[2]).isEqualTo("안녕하세요");
    }

    @Test
    public void parse_메서드_테스트2() {
        String answer = "입력하려구요!!!";
        Object[] data = Parser.parse(answer);
        assertThat(data[0]).isEqualTo("입력하려구요!!!");
    }
}