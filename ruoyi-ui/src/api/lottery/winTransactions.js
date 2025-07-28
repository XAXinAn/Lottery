import request from '@/utils/request'

// 查询中奖交易记录列表
export function listWinTransactions(query) {
  return request({
    url: '/lottery/winTransactions/list',
    method: 'get',
    params: query
  })
}

// 查询中奖交易记录详细
export function getWinTransactions(time) {
  return request({
    url: '/lottery/winTransactions/' + time,
    method: 'get'
  })
}

// 新增中奖交易记录
export function addWinTransactions(data) {
  return request({
    url: '/lottery/winTransactions',
    method: 'post',
    data: data
  })
}

// 修改中奖交易记录
export function updateWinTransactions(data) {
  return request({
    url: '/lottery/winTransactions',
    method: 'put',
    data: data
  })
}

// 删除中奖交易记录
export function delWinTransactions(time) {
  return request({
    url: '/lottery/winTransactions/' + time,
    method: 'delete'
  })
}

// 抽奖接口
export function lotteryWinTransactions() {
  return request({
    url: '/lottery/winTransactions/lottery',
    method: 'get'
  })
}
