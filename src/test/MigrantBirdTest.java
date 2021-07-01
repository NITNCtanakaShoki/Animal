package test;

import main.Bird;
import main.MigrantBird;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MigrantBirdTest {
    @Test
    public void 初期値() {
        MigrantBird migrantBird = new MigrantBird(9);
        assertEquals("pos:0 vit:9/9", migrantBird.toString());
    }

    @Test
    public void 眠る() {
        MigrantBird migrantBird = new MigrantBird(12);
        migrantBird.sleep();
        assertEquals("pos:3 vit:12/12", migrantBird.toString());
    }

    @Test
    public void 鳥の継承確認() {
        Bird bird = new MigrantBird(13);
        Assertions.assertEquals("pos:0 vit:13/13", bird.toString());
    }

}
