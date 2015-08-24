
package lib.jacob.org.lib;

/**
 * Created by moses on 8/5/14.
 */
public class JbigCodecFactory {
    public enum CODEC {
        JNI_CODEC
    };

    public static JbigCodec getJbigCodec(CODEC codec) {
        switch(codec) {
            case JNI_CODEC:
                return new JniJbigCodec();
            default:
                return null;
        }
    }
}