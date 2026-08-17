
package mk.ukim.finki.wp.june2025g1.model.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidStartupIdException extends RuntimeException {

    public InvalidStartupIdException(Long Id) {
        super(String.format("Startup with id %d does not exist.", Id));
    }
}