package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userinterfaces.ValidateDatacenterInterface.LOCATION;

public class DatacenterQuestion implements Question<Boolean>{
        @Override
        public Boolean answeredBy(Actor actor) {
            return LOCATION.resolveFor(actor).isVisible();
        }

        public static DatacenterQuestion locationDatecenter() {
            return new DatacenterQuestion();
        }
    }

