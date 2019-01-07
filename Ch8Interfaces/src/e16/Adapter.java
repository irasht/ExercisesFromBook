package e16;

import java.io.IOException;
import java.nio.CharBuffer;

public class Adapter extends CharSequence implements Readable {
    private int count;

    public Adapter(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;
        char[] buffer = generate();
        cb.put(buffer);
        return buffer.length;
    }
}
