import request from '@/utils/request'

// 查询网点号列表
export function listOrgNo(query) {
  return request({
    url: '/lottery/orgNo/list',
    method: 'get',
    params: query
  })
}

// 查询网点号详细
export function getOrgNo(orgNo) {
  return request({
    url: '/lottery/orgNo/' + orgNo,
    method: 'get'
  })
}

// 新增网点号
export function addOrgNo(data) {
  return request({
    url: '/lottery/orgNo',
    method: 'post',
    data: data
  })
}

// 修改网点号
export function updateOrgNo(data) {
  return request({
    url: '/lottery/orgNo',
    method: 'put',
    data: data
  })
}

// 删除网点号
export function delOrgNo(orgNo) {
  return request({
    url: '/lottery/orgNo/' + orgNo,
    method: 'delete'
  })
}
