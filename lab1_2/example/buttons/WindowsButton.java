package example.buttons;

/**
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под MacOS.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}