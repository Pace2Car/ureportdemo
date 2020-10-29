/**
 * ureport报表文件服务API接口层(自动生成）
 *
 * +---------------------------------------------------+
 * |    该文件生成后请自行移动到前端项目的接口层中。   |
 * +---------------------------------------------------+
 *
 * @author Pace2Car
 * @since 2020-10-28
 */
import request from '@/api/axios';

export default {
    // ************************* 自动生成方法 BEGIN *************************
    /**
     * POST 分页查询,通过某一个字段、当前页号，页尺寸获取符合条件的UreportFile对象列表和总记录数
     * @param {Object} data 请求参数
     * @param {String} [data.pkId] 搜索字段
     * @param {Number} data.currentPage 当前页号
     * @param {Number} data.pageSize 页尺寸
     * @returns {Object} Primise
     */
    selectPageAPI: data => {
        return request({
            url: '/api/v1/ureportFile/selectPage',
            method: 'post',
            data: data
        })
    },
    /**
     * GET 获取所有未逻辑删除的UreportFile对象
     * @returns {Object} Primise
     */
    selectAllAPI: () => {
        return request({
            url: '/api/v1/ureportFile/selectAll',
            method: 'get'
        })
    },
    // ************************* 自动生成方法 END ***************************

    // ************************* 自定义方法 BEGIN ***************************

    // ************************* 自定义方法 END *****************************
};
