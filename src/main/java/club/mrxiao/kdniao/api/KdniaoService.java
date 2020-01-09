package club.mrxiao.kdniao.api;

/**
 * <pre>
 *     快递鸟api接口
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
public interface KdniaoService {

    /**
     * 获取电子面单api接口
     * @return 电子面单api接口
     */
    KdniaoSurfaceSheetService getKdniaoSurfaceSheetService();
}
