import usecase.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FitsTest {
    @Test
    @DisplayName("Deve retornar verdadeiro se as fotos se encaixarem horizontalmente")
    void shouldReturnTrueIfPhotosFitHorizontally() {
        Photo photo1 = new Photo(3, 4);
        Photo photo2 = new Photo(3, 4);
        Fits fits = new Fits(photo1, photo2, 7, 5);
        assertThat(fits.handle()).isTrue();
    }

    @Test
    @DisplayName("Deve retornar verdadeiro se as fotos se encaixarem verticalmente")
    void shouldReturnTrueIfPhotosFitVertically() {
        Photo photo1 = new Photo(3, 4);
        Photo photo2 = new Photo(3, 4);
        Fits fits = new Fits(photo1, photo2, 7, 5);
        assertThat(fits.handle()).isTrue();
    }

    @Test
    @DisplayName("Deve retornar falso se as fotos não se encaixarem")
    void shouldReturnFalseIfPhotosDoNotFit() {
        Photo photo1 = new Photo(3, 3);
        Photo photo2 = new Photo(3, 3);
        Fits fits = new Fits(photo1, photo2, 4, 3);
        assertThat(fits.handle()).isFalse();
    }

    @Test
    @DisplayName("Deve falhar no teste devido ao uso desnecessário de stubbing")
    void shouldFailTestDueToUnnecessaryStubbing() {
        Photo photo1 = new Photo(3, 3);
        Photo photo2 = new Photo(3, 3);
        Fits fits = new Fits(photo1, photo2, 4, 3);
        assertThatIllegalArgumentException().isThrownBy(() -> fits.handle());
    }
}
