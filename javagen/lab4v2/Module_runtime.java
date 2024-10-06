// HASH COLLISIONS: YES
// timestamp: 1727630302000

package lab4v2;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_runtime {
	public static Reference<Boolean> g_localStorageEnabled;
	public static void init() {
		g_localStorageEnabled=((Reference<Boolean>)(new Reference(true)));
	}
	// The wrapper to a native: Native.fast_max
	public static final Object f_max(Object al0_0, Object al1_1) {
		return Native.fast_max(al0_0, al1_1);
	}
	public static final Object f_println(Object astr) {
		if (Module_securitymode.f_isLoggingEnabled()) {
			return Native.println(((Object)astr));
		} else {
			return null;
		}
	}
}
