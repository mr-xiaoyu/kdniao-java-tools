package club.mrxiao.kdniao.api.impl;


import club.mrxiao.kdniao.api.KdniaoService;
import club.mrxiao.kdniao.api.KdniaoSurfaceSheetService;

/**
 * <pre>
 *     快递鸟api接口实现
 * </pre>
 * @author <a href="https://github.com/mr-xiaoyu">xiaoyu</a>
 * @since 2020-01-09
 */
public class KdniaoServiceImpl implements KdniaoService {

    private KdniaoSurfaceSheetService surfaceSheetService = new KdniaoSurfaceSheetServiceImpl(this);

    @Override
    public KdniaoSurfaceSheetService getKdniaoSurfaceSheetService() {
        return this.surfaceSheetService;
    }
}
