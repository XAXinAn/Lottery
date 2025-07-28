import request from '@/utils/request'

// 查询中奖区间信息列表
export function listPrizes(query) {
  return request({
    url: '/lottery/prizes/list',
    method: 'get',
    params: query
  })
}

// 查询中奖区间信息详细
export function getPrizes(maxAmount) {
  return request({
    url: '/lottery/prizes/' + maxAmount,
    method: 'get'
  })
}

// 新增中奖区间信息
export function addPrizes(data) {
  return request({
    url: '/lottery/prizes',
    method: 'post',
    data: data
  })
}

// 修改中奖区间信息
export function updatePrizes(data) {
  return request({
    url: '/lottery/prizes',
    method: 'put',
    data: data
  })
}

// 删除中奖区间信息
export function delPrizes(maxAmount) {
  return request({
    url: '/lottery/prizes/' + maxAmount,
    method: 'delete'
  })
}
