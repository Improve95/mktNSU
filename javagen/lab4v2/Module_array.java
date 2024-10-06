// HASH COLLISIONS: YES
// timestamp: 1727630302000

package lab4v2;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_array {
	public static final Object[] f_arrayPush(Object[] aarray, Object avalue) {
		return Native.replace(aarray, Native.length(aarray), avalue);
	}
}
