import usecase.Fits;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FitsTest {

    @Test
    @DisplayName("Teste de Encaixe - Pode Encaixar")
    public void testCanFit() {
        Photo photo1 = new Photo(3, 4);
        Photo photo2 = new Photo(3, 4);
        Fits fits1 = new Fits(photo1, photo2, 7, 5);
        assertThat(fits1.handle()).isTrue();

        Photo photo3 = new Photo(6, 6);
        Photo photo4 = new Photo(6, 6);
        Fits fits2 = new Fits(photo3, photo4, 10, 10);
        assertThat(fits2.handle()).isTrue();
    }

    @Test
    @DisplayName("Teste de Encaixe - Não Pode Encaixar")
    public void testCannotFit() {
        Photo photo1 = new Photo(3, 3);
        Photo photo2 = new Photo(3, 3);
        Fits fits3 = new Fits(photo1, photo2, 4, 3);
        assertThat(fits3.handle()).isFalse();

        Photo photo3 = new Photo(4, 4);
        Photo photo4 = new Photo(4, 4);
        Fits fits4 = new Fits(photo3, photo4, 6, 4);
        assertThat(fits4.handle()).isFalse();
    }
}
