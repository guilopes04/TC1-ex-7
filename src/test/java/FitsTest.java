import usecase.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FitsTest {

    @Test
    @DisplayName("Deve retornar verdadeiro se as fotos couberem horizontalmente na página do álbum")
    void shouldReturnTrueIfPhotosFitHorizontally() {
        Photo photo1 = new Photo(3, 4);
        Photo photo2 = new Photo(3, 4);
        Fits fits = new Fits(photo1, photo2, 5, 7);
        assertThat(fits.handle()).isTrue();
    }

    @Test
    @DisplayName("Deve retornar verdadeiro se as fotos couberem verticalmente na página do álbum")
    void shouldReturnTrueIfPhotosFitVertically() {
        Photo photo1 = new Photo(4, 3);
        Photo photo2 = new Photo(4, 3);
        Fits fits = new Fits(photo1, photo2, 7, 5);
        assertThat(fits.handle()).isTrue();
    }

    @Test
    @DisplayName("Deve retornar verdadeiro se as fotos couberem horizontalmente e verticalmente na página do álbum")
    void shouldReturnTrueIfPhotosFitBothHorizontallyAndVertically() {
        Photo photo1 = new Photo(2, 3);
        Photo photo2 = new Photo(3, 2);
        Fits fits = new Fits(photo1, photo2, 3, 3);
        assertThat(fits.handle()).isTrue();
    }

    @Test
    @DisplayName("Deve retornar falso se as fotos não couberem nem horizontalmente nem verticalmente na página do álbum")
    void shouldReturnFalseIfPhotosDoNotFitHorizontallyNorVertically() {
        Photo photo1 = new Photo(5, 7);
        Photo photo2 = new Photo(7, 5);
        Fits fits = new Fits(photo1, photo2, 5, 7);
        assertThat(fits.handle()).isFalse();
    }
}
