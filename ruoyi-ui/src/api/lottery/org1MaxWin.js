import request from '@/utils/request'

// 查询支行最高奖状态列表
export function listOrg1MaxWin(query) {
  return request({
    url: '/lottery/org1MaxWin/list',
    method: 'get',
    params: query
  })
}

// 查询支行最高奖状态详细
export function getOrg1MaxWin(org1Code) {
  return request({
    url: '/lottery/org1MaxWin/' + org1Code,
    method: 'get'
  })
}

// 新增支行最高奖状态
export function addOrg1MaxWin(data) {
  return request({
    url: '/lottery/org1MaxWin',
    method: 'post',
    data: data
  })
}

// 修改支行最高奖状态
export function updateOrg1MaxWin(data) {
  return request({
    url: '/lottery/org1MaxWin',
    method: 'put',
    data: data
  })
}

// 删除支行最高奖状态
export function delOrg1MaxWin(org1Code) {
  return request({
    url: '/lottery/org1MaxWin/' + org1Code,
    method: 'delete'
  })
}
