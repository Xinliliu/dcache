/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package diskCacheV111.services.space;
import org.dcache.auth.AuthorizationRecord;
import diskCacheV111.util.VOInfo;

/**
 *
 * @author timur
 */
public interface SpaceManagerAuthorizationPolicy {

    public void checkReleasePermission(AuthorizationRecord authRecord, Space space)
        throws SpaceAuthorizationException;
    public VOInfo checkReservePermission(AuthorizationRecord authRecord, LinkGroup linkGroup)
        throws SpaceAuthorizationException;

}
